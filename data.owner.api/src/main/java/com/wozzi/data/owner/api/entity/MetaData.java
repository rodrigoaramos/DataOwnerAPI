package com.wozzi.data.owner.api.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "meta_data", schema = "metadata")
public class MetaData {

    @GenericGenerator(
            name = "metadataSequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "metadata_sequence"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )
    @Id
    @GeneratedValue(generator = "metadataSequenceGenerator")
    private Long id;
    private Long parentId;
    private Long metaDataTypeId;

    @OneToOne(
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "id",
            referencedColumnName = "meta_data_type_id"
    )
    private MetaDataType metaDataType;

}
