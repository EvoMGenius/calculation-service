package ru.bunkov.calculation.model.calculation.openingproductioncost;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPurchasePatent is a Querydsl query type for PurchasePatent
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPurchasePatent extends BeanPath<PurchasePatent> {

    private static final long serialVersionUID = 1928149908L;

    public static final QPurchasePatent purchasePatent = new QPurchasePatent("purchasePatent");

    public final BooleanPath isIEAndTaxSystemIsPatent = createBoolean("isIEAndTaxSystemIsPatent");

    public final NumberPath<java.math.BigDecimal> patentCost = createNumber("patentCost", java.math.BigDecimal.class);

    public final ComparablePath<java.util.UUID> potentialIncomeId = createComparable("potentialIncomeId", java.util.UUID.class);

    public QPurchasePatent(String variable) {
        super(PurchasePatent.class, forVariable(variable));
    }

    public QPurchasePatent(Path<? extends PurchasePatent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPurchasePatent(PathMetadata metadata) {
        super(PurchasePatent.class, metadata);
    }

}

