@OneToMany (mappedBy="continent")
@JoinColumn(name = "CONT_ID")
private Set<Country> countries = new HashSet<Country>();