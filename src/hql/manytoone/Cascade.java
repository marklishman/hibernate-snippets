@OneToMany (mappedBy="continent", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
@org.hibernate.annotations.Cascade( {org.hibernate.annotations.CascadeType.SAVE_UPDATE})
@JoinColumn(name = "CONT_ID")
private Set<Country> countries = new HashSet<Country>();
