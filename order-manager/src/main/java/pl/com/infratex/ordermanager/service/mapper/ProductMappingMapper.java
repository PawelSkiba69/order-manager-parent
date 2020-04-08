package pl.com.infratex.ordermanager.service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.dao.entity.ProductMappingEntity;
import pl.com.infratex.ordermanager.web.model.ProductMappingModel;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMappingMapper {

    public ProductMappingEntity fromModel(ProductMappingModel productMappingModel) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(productMappingModel, ProductMappingEntity.class);
    }

    public ProductMappingModel fromEntity(ProductMappingEntity productMappingEntity) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(productMappingEntity, ProductMappingModel.class);
    }

    public List<ProductMappingEntity> fromModels(List<ProductMappingModel> productMappingModels) {
        return productMappingModels.stream()
                .map(this::fromModel)
                .collect(Collectors.toList());
    }

    public List<ProductMappingModel> fromEntities(List<ProductMappingEntity> productMappingEntities) {
        return productMappingEntities.stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());
    }
}
