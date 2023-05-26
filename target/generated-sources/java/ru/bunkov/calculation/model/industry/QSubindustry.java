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

    public final NumberPath<Double> averageEmployeeCount2020 = createNumber("averageEmployeeCount2020", Double.class);

    public final NumberPath<Double> averageEmployeeCount2021 = createNumber("averageEmployeeCount2021", Double.class);

    public final NumberPath<Double> averageSalary2020 = createNumber("averageSalary2020", Double.class);

    public final NumberPath<Double> averageSalary2021 = createNumber("averageSalary2021", Double.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final NumberPath<Double> incomeTax2021 = createNumber("incomeTax2021", Double.class);

    public final NumberPath<Double> incomeTax2022 = createNumber("incomeTax2022", Double.class);

    public final NumberPath<Double> landTax2021 = createNumber("landTax2021", Double.class);

    public final NumberPath<Double> landTax2022 = createNumber("landTax2022", Double.class);

    public final StringPath name = createString("name");

    public final NumberPath<Double> otherTax2021 = createNumber("otherTax2021", Double.class);

    public final NumberPath<Double> otherTax2022 = createNumber("otherTax2022", Double.class);

    public final NumberPath<Double> personalIncomeTax2021 = createNumber("personalIncomeTax2021", Double.class);

    public final NumberPath<Double> personalIncomeTax2022 = createNumber("personalIncomeTax2022", Double.class);

    public final NumberPath<Double> propertyTax2021 = createNumber("propertyTax2021", Double.class);

    public final NumberPath<Double> propertyTax2022 = createNumber("propertyTax2022", Double.class);

    public final NumberPath<Double> taxToMoscowBudget2021 = createNumber("taxToMoscowBudget2021", Double.class);

    public final NumberPath<Double> taxToMoscowBudget2022 = createNumber("taxToMoscowBudget2022", Double.class);

    public final NumberPath<Double> transportTax2021 = createNumber("transportTax2021", Double.class);

    public final NumberPath<Double> transportTax2022 = createNumber("transportTax2022", Double.class);

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

