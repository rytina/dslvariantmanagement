featuremodel "platform:/resource/my.dsl.pv/my.dsl.pv.xfm.xmi"

entity E1 {
	a : String feature f1
}

entity E2 tags(t1) {
} 

entity  E3 tags (t1) {
} 

aspect {name=E*} entity aoAll feature f3 {
	aAll : int
}

aspect {name=E2} entity aoE2 feature f3 {
	a2 : int
}

aspect {tag=t1} entity aoT1 feature f3 {
	aeT1 : int
} 
