@ManyToOne (fetch=FetchType.LAZY)
@JoinColumn(name = "CONT_ID")
private Continent continent;