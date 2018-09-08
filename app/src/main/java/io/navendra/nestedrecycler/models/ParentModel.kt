package io.navendra.nestedrecycler.models

data class ParentModel (
        val title : String = "",
        val children : List<ChildModel>
)