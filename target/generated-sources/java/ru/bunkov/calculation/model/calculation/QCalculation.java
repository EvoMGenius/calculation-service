package ru.bunkov.calculation.model.calculation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCalculation is a Querydsl query type for Calculation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCalculation extends EntityPathBase<Calculation> {

    private static final long serialVersionUID = -1532601042L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCalculation calculation = new QCalculation("calculation");

    public final NumberPath<java.math.BigDecimal> accountingCost = createNumber("accountingCost", java.math.BigDecimal.class);

    public final ru.bunkov.calculation.model.calculation.capitalinvestment.QCapitalInvestments capitalInvestments;

    public final ru.bunkov.calculation.model.calculation.openingproductioncost.QCostsOfOpeningProduction costsOfOpeningProduction;

    public final QExpenses expenses;

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final NumberPath<java.math.BigDecimal> initialExpenses = createNumber("initialExpenses", java.math.BigDecimal.class);

    public final ListPath<String, StringPath> otherNeeds = this.<String, StringPath>createList("otherNeeds", String.class, StringPath.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> totalCostMaxOfAll = createNumber("totalCostMaxOfAll", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalCostMinOfAll = createNumber("totalCostMinOfAll", java.math.BigDecimal.class);

    public QCalculation(String variable) {
        this(Calculation.class, forVariable(variable), INITS);
    }

    public QCalculation(Path<? extends Calculation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCalculation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCalculation(PathMetadata metadata, PathInits inits) {
        this(Calculation.class, metadata, inits);
    }

    public QCalculation(Class<? extends Calculation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.capitalInvestments = inits.isInitialized("capitalInvestments") ? new ru.bunkov.calculation.model.calculation.capitalinvestment.QCapitalInvestments(forProperty("capitalInvestments"), inits.get("capitalInvestments")) : null;
        this.costsOfOpeningProduction = inits.isInitialized("costsOfOpeningProduction") ? new ru.bunkov.calculation.model.calculation.openingproductioncost.QCostsOfOpeningProduction(forProperty("costsOfOpeningProduction"), inits.get("costsOfOpeningProduction")) : null;
        this.expenses = inits.isInitialized("expenses") ? new QExpenses(forProperty("expenses"), inits.get("expenses")) : null;
    }

}

