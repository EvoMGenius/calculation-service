package ru.bunkov.calculation.model.calculation.openingproductioncost;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QHiringStaff is a Querydsl query type for HiringStaff
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QHiringStaff extends BeanPath<HiringStaff> {

    private static final long serialVersionUID = 1087060164L;

    public static final QHiringStaff hiringStaff = new QHiringStaff("hiringStaff");

    public final NumberPath<java.math.BigDecimal> averageSalary = createNumber("averageSalary", java.math.BigDecimal.class);

    public final NumberPath<Double> staffCount = createNumber("staffCount", Double.class);

    public final NumberPath<java.math.BigDecimal> totalStaffCost = createNumber("totalStaffCost", java.math.BigDecimal.class);

    public QHiringStaff(String variable) {
        super(HiringStaff.class, forVariable(variable));
    }

    public QHiringStaff(Path<? extends HiringStaff> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHiringStaff(PathMetadata metadata) {
        super(HiringStaff.class, metadata);
    }

}

