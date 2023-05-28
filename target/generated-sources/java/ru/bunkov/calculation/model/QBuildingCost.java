package ru.bunkov.calculation.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBuildingCost is a Querydsl query type for BuildingCost
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBuildingCost extends EntityPathBase<BuildingCost> {

    private static final long serialVersionUID = 1461002455L;

    public static final QBuildingCost buildingCost = new QBuildingCost("buildingCost");

    public final NumberPath<Double> cost = createNumber("cost", Double.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath type = createString("type");

    public QBuildingCost(String variable) {
        super(BuildingCost.class, forVariable(variable));
    }

    public QBuildingCost(Path<? extends BuildingCost> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBuildingCost(PathMetadata metadata) {
        super(BuildingCost.class, metadata);
    }

}

