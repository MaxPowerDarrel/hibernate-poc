# Highlights


There are two POJO's involved here

-  Widget
- Widget Container

`Widget` has a `ManyToOne` relationship to `WidgetContainer` - many widgets can fit into one container

If the `JsonManagedReference` and the `JsonBackReference` annotations are removed, we will have infinite recursion


