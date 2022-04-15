package fitlers;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import entities.Product;


/**
 * Servlet Filter implementation class CreateUserFilter
 */
@WebFilter(
		urlPatterns = {"/admin/products/store","/admin/products/update"},
		filterName = "product_filter"
		)
public class ProductFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

	public ProductFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session  = req.getSession();
		
		Product p = new Product();
		try {
			BeanUtils.populate(p, req.getParameterMap());
			if(p.getTen().equals("")  || p.getMauSac().equals("")||p.getKichThuoc().equals("")) {
				session.setAttribute("error", "Nhập đầy đủ thông tin");
				res.sendRedirect("/ASM_Java4/admin/products/index");
				return;
			}
			if(p.getDonGia() < 1 || p.getSoLuong() < 1) {
				session.setAttribute("error", "�?ơn giá và số lượng > 0");
				res.sendRedirect("/ASM_Java4/admin/products/index");
				return;
			}
				chain.doFilter(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
