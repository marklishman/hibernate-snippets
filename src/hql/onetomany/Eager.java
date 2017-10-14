@OneToMany (fetch=FetchType.EAGER)
@JoinColumn(name = "CONT_ID")
private Set<Country> countries = new HashSet<Country>();