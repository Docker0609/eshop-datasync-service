package com.roncoo.eshop.datasync.service.fallback;

import org.springframework.stereotype.Component;

import com.roncoo.eshop.datasync.service.EshopProductService;

/**降级服务方法
 * @author balderWu
 *
 */
@Component
public class EshopProductServiceFallback implements EshopProductService {

	@Override
	public String findBrandById(Long id) {
		
		return "降级服务";
	}

	@Override
	public String findBrandByIds(String ids) {
		return "降级服务";
	}

	@Override
	public String findCategoryById(Long id) {
		return "降级服务";
	}

	@Override
	public String findProductIntroById(Long id) {
		return "降级服务";
	}

	@Override
	public String findProductPropertyById(Long id) {
		return "降级服务";
	}

	@Override
	public String findProductById(Long id) {
		return "降级服务";
	}

	@Override
	public String findProductSpecificationById(Long id) {
		return "降级服务";
	}

}
