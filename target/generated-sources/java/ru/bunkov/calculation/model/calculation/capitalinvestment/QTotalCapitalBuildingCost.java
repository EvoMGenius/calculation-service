package ru.bunkov.calculation.model.calculation.capitalinvestment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTotalCapitalBuildingCost is a Querydsl query type for TotalCapitalBuildingCost
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QTotalCapitalBuildingCost extends BeanPath<TotalCapitalBuildingCost> {

    private static final long serialVersionUID = 610573715L;

    public static final QTotalCapitalBuildingCost totalCapitalBuildingCost1 = new QTotalCapitalBuildingCost("totalCapitalBuildingCost1");

    public final ListPath<PairForCapitalBuilding, QPairForCapitalBuilding> capitalBuildingObjIdAndAreaPairList = this.<PairForCapitalBuilding, QPairForCapitalBuilding>createList("capitalBuildingObjIdAndAreaPairList", PairForCapitalBuilding.class, QPairForCapitalBuilding.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> totalCapitalBuildingCost = createNumber("totalCapitalBuildingCost", java.math.BigDecimal.class);

    public QTotalCapitalBuildingCost(String variable) {
        super(TotalCapitalBuildingCost.class, forVariable(variable));
    }

    public QTotalCapitalBuildingCost(Path<? extends TotalCapitalBuildingCost> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTotalCapitalBuildingCost(PathMetadata metadata) {
        super(TotalCapitalBuildingCost.class, metadata);
    }

}

