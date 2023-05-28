package ru.bunkov.calculation.model.calculation.openingproductioncost;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPairForEquipment is a Querydsl query type for PairForEquipment
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPairForEquipment extends BeanPath<PairForEquipment> {

    private static final long serialVersionUID = -2043371062L;

    public static final QPairForEquipment pairForEquipment = new QPairForEquipment("pairForEquipment");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final ComparablePath<java.util.UUID> equipmentId = createComparable("equipmentId", java.util.UUID.class);

    public QPairForEquipment(String variable) {
        super(PairForEquipment.class, forVariable(variable));
    }

    public QPairForEquipment(Path<? extends PairForEquipment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPairForEquipment(PathMetadata metadata) {
        super(PairForEquipment.class, metadata);
    }

}

