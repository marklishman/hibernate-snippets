@Entity
@Table(name="COUNTRY")
public class Country {

    @Id
    @GeneratedValue
    @Column(name="CTRY_ID")
    private Integer id;

    @Column(name="CTRY_NAME")
    private String name;

    private int area;

    @Transient
    private int rank;

    @ManyToOne
    @JoinColumn(name = "CONT_ID")
    private Continent continent;


}