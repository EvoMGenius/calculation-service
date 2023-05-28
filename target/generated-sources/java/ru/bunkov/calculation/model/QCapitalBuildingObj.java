package ru.bunkov.calculation.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCapitalBuildingObj is a Querydsl query type for CapitalBuildingObj
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCapitalBuildingObj extends EntityPathBase<CapitalBuildingObj> {

    private static final long serialVersionUID = -1564471599L;

    public static final QCapitalBuildingObj capitalBuildingObj = new QCapitalBuildingObj("capitalBuildingObj");

    public final NumberPath<java.math.BigDecimal> cost = createNumber("cost", java.math.BigDecimal.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath type = createString("type");

    public QCapitalBuildingObj(String variable) {
        super(CapitalBuildingObj.class, forVariable(variable));
    }

    public QCapitalBuildingObj(Path<? extends CapitalBuildingObj> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCapitalBuildingObj(PathMetadata metadata) {
        super(CapitalBuildingObj.class, metadata);
    }

}

