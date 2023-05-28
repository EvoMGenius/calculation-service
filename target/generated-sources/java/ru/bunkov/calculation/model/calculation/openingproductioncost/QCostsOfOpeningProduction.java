package ru.bunkov.calculation.model.calculation.openingproductioncost;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCostsOfOpeningProduction is a Querydsl query type for CostsOfOpeningProduction
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCostsOfOpeningProduction extends BeanPath<CostsOfOpeningProduction> {

    private static final long serialVersionUID = -139245825L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCostsOfOpeningProduction costsOfOpeningProduction = new QCostsOfOpeningProduction("costsOfOpeningProduction");

    public final QEquipmentPurchasePrice equipmentPurchasePrice;

    public final QHiringStaff hiringStaff;

    public final QPurchasePatent purchasePatent;

    public final NumberPath<java.math.BigDecimal> totalCostOfOpeningProduction = createNumber("totalCostOfOpeningProduction", java.math.BigDecimal.class);

    public QCostsOfOpeningProduction(String variable) {
        this(CostsOfOpeningProduction.class, forVariable(variable), INITS);
    }

    public QCostsOfOpeningProduction(Path<? extends CostsOfOpeningProduction> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCostsOfOpeningProduction(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCostsOfOpeningProduction(PathMetadata metadata, PathInits inits) {
        this(CostsOfOpeningProduction.class, metadata, inits);
    }

    public QCostsOfOpeningProduction(Class<? extends CostsOfOpeningProduction> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.equipmentPurchasePrice = inits.isInitialized("equipmentPurchasePrice") ? new QEquipmentPurchasePrice(forProperty("equipmentPurchasePrice")) : null;
        this.hiringStaff = inits.isInitialized("hiringStaff") ? new QHiringStaff(forProperty("hiringStaff")) : null;
        this.purchasePatent = inits.isInitialized("purchasePatent") ? new QPurchasePatent(forProperty("purchasePatent")) : null;
    }

}

