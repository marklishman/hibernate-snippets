@Entity
@Table(name="CONTINENT")
public class Continent {

    @Id
    @GeneratedValue
    @Column(name="CONT_ID")
    private Integer id;

    @Column(name="CONT_NAME")
    private String name;

    @OneToMany
    @JoinColumn(name = "CONT_ID")
    private Set<Country> countries = new HashSet<Country>();

}