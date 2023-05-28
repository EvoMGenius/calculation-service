package ru.bunkov.calculation.model.calculation.capitalinvestment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCapitalInvestments is a Querydsl query type for CapitalInvestments
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCapitalInvestments extends BeanPath<CapitalInvestments> {

    private static final long serialVersionUID = -446834362L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCapitalInvestments capitalInvestments = new QCapitalInvestments("capitalInvestments");

    public final QLandCost landCost;

    public final QTotalBuildingCost totalBuildingCost;

    public final QTotalCapitalBuildingCost totalCapitalBuildingCost;

    public final NumberPath<java.math.BigDecimal> totalCostMax = createNumber("totalCostMax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalCostMin = createNumber("totalCostMin", java.math.BigDecimal.class);

    public QCapitalInvestments(String variable) {
        this(CapitalInvestments.class, forVariable(variable), INITS);
    }

    public QCapitalInvestments(Path<? extends CapitalInvestments> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCapitalInvestments(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCapitalInvestments(PathMetadata metadata, PathInits inits) {
        this(CapitalInvestments.class, metadata, inits);
    }

    public QCapitalInvestments(Class<? extends CapitalInvestments> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.landCost = inits.isInitialized("landCost") ? new QLandCost(forProperty("landCost")) : null;
        this.totalBuildingCost = inits.isInitialized("totalBuildingCost") ? new QTotalBuildingCost(forProperty("totalBuildingCost")) : null;
        this.totalCapitalBuildingCost = inits.isInitialized("totalCapitalBuildingCost") ? new QTotalCapitalBuildingCost(forProperty("totalCapitalBuildingCost")) : null;
    }

}

