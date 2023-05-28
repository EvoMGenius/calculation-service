package ru.bunkov.calculation.model.industry;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSubindustry is a Querydsl query type for Subindustry
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSubindustry extends EntityPathBase<Subindustry> {

    private static final long serialVersionUID = 670375428L;

    public static final QSubindustry subindustry = new QSubindustry("subindustry");

    public final NumberPath<java.math.BigDecimal> averageEmployeeCount2020 = createNumber("averageEmployeeCount2020", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> averageEmployeeCount2021 = createNumber("averageEmployeeCount2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> averageSalary2020 = createNumber("averageSalary2020", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> averageSalary2021 = createNumber("averageSalary2021", java.math.BigDecimal.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final NumberPath<java.math.BigDecimal> incomeTax2021 = createNumber("incomeTax2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> incomeTax2022 = createNumber("incomeTax2022", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> landTax2021 = createNumber("landTax2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> landTax2022 = createNumber("landTax2022", java.math.BigDecimal.class);

    public final StringPath name = createString("name");

    public final NumberPath<java.math.BigDecimal> otherTax2021 = createNumber("otherTax2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> otherTax2022 = createNumber("otherTax2022", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> personalIncomeTax2021 = createNumber("personalIncomeTax2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> personalIncomeTax2022 = createNumber("personalIncomeTax2022", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> propertyTax2021 = createNumber("propertyTax2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> propertyTax2022 = createNumber("propertyTax2022", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> spendOnHiringStaff2020 = createNumber("spendOnHiringStaff2020", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> spendOnHiringStaff2021 = createNumber("spendOnHiringStaff2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> taxSumm2021 = createNumber("taxSumm2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> taxSumm2022 = createNumber("taxSumm2022", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> taxToMoscowBudget2021 = createNumber("taxToMoscowBudget2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> taxToMoscowBudget2022 = createNumber("taxToMoscowBudget2022", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> transportTax2021 = createNumber("transportTax2021", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> transportTax2022 = createNumber("transportTax2022", java.math.BigDecimal.class);

    public QSubindustry(String variable) {
        super(Subindustry.class, forVariable(variable));
    }

    public QSubindustry(Path<? extends Subindustry> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubindustry(PathMetadata metadata) {
        super(Subindustry.class, metadata);
    }

}

