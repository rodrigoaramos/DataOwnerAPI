package com.wozzi.data.owner.api.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Entity
@Data
@Table(name = "data_owner", schema = "metadata")
public class DataOwner {

    @GenericGenerator(
            name = "dataOwnerSequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "dataowner_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @Id
    @GeneratedValue(generator = "dataOwnerSequenceGenerator")
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "data_of_holder",
            joinColumns =
                    { @JoinColumn(name = "data_owner_id", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "meta_data_id", referencedColumnName = "id") })
    private MetaData metaData;
}
