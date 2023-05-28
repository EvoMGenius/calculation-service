package ru.bunkov.calculation.model.calculation.openingproductioncost;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEquipmentPurchasePrice is a Querydsl query type for EquipmentPurchasePrice
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QEquipmentPurchasePrice extends BeanPath<EquipmentPurchasePrice> {

    private static final long serialVersionUID = -482813787L;

    public static final QEquipmentPurchasePrice equipmentPurchasePrice = new QEquipmentPurchasePrice("equipmentPurchasePrice");

    public final ListPath<PairForEquipment, QPairForEquipment> equipmentIdAndCountPairList = this.<PairForEquipment, QPairForEquipment>createList("equipmentIdAndCountPairList", PairForEquipment.class, QPairForEquipment.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> totalEquipmentCost = createNumber("totalEquipmentCost", java.math.BigDecimal.class);

    public QEquipmentPurchasePrice(String variable) {
        super(EquipmentPurchasePrice.class, forVariable(variable));
    }

    public QEquipmentPurchasePrice(Path<? extends EquipmentPurchasePrice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEquipmentPurchasePrice(PathMetadata metadata) {
        super(EquipmentPurchasePrice.class, metadata);
    }

}

