package ru.bunkov.calculation.model.calculation.capitalinvestment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTotalBuildingCost is a Querydsl query type for TotalBuildingCost
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QTotalBuildingCost extends BeanPath<TotalBuildingCost> {

    private static final long serialVersionUID = -667862921L;

    public static final QTotalBuildingCost totalBuildingCost1 = new QTotalBuildingCost("totalBuildingCost1");

    public final ListPath<PairForBuilding, QPairForBuilding> buildingCostIdAndAreaPairList = this.<PairForBuilding, QPairForBuilding>createList("buildingCostIdAndAreaPairList", PairForBuilding.class, QPairForBuilding.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> totalBuildingCost = createNumber("totalBuildingCost", java.math.BigDecimal.class);

    public QTotalBuildingCost(String variable) {
        super(TotalBuildingCost.class, forVariable(variable));
    }

    public QTotalBuildingCost(Path<? extends TotalBuildingCost> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTotalBuildingCost(PathMetadata metadata) {
        super(TotalBuildingCost.class, metadata);
    }

}

