package ru.bunkov.calculation.model.calculation.taxandsalary;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOtherTax is a Querydsl query type for OtherTax
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QOtherTax extends BeanPath<OtherTax> {

    private static final long serialVersionUID = -1065035080L;

    public static final QOtherTax otherTax1 = new QOtherTax("otherTax1");

    public final NumberPath<java.math.BigDecimal> landTax = createNumber("landTax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> otherTax = createNumber("otherTax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> propertyTax = createNumber("propertyTax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> totalOtherTax = createNumber("totalOtherTax", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> transportTax = createNumber("transportTax", java.math.BigDecimal.class);

    public QOtherTax(String variable) {
        super(OtherTax.class, forVariable(variable));
    }

    public QOtherTax(Path<? extends OtherTax> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOtherTax(PathMetadata metadata) {
        super(OtherTax.class, metadata);
    }

}

