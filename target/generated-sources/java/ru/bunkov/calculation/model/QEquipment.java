package ru.bunkov.calculation.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEquipment is a Querydsl query type for Equipment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEquipment extends EntityPathBase<Equipment> {

    private static final long serialVersionUID = 958651672L;

    public static final QEquipment equipment = new QEquipment("equipment");

    public final NumberPath<Double> averageCost = createNumber("averageCost", Double.class);

    public final StringPath equipmentType = createString("equipmentType");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public QEquipment(String variable) {
        super(Equipment.class, forVariable(variable));
    }

    public QEquipment(Path<? extends Equipment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEquipment(PathMetadata metadata) {
        super(Equipment.class, metadata);
    }

}

