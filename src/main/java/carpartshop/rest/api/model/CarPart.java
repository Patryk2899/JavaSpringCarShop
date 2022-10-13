package carpartshop.rest.api.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@EntityListeners(AuditingEntityListener.class)
@Table(name = "CarParts")
public class CarPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Categorie categorie;

    private String name;
    private int quantity;
    private float price;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carPart")
    private Set<CarModel> carModels = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carPart")
    private Set<OrderItem> orderItems = new HashSet<>();

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;
}
