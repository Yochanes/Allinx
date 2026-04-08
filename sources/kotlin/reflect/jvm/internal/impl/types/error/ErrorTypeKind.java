package kotlin.reflect.jvm.internal.impl.types.error;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum ErrorTypeKind {
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Unresolved type for %s", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Unresolved type parameter type", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("Unresolved class %s", true),
    f54974c("Unresolved java class %s", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("Unresolved declaration %s", true),
    f54975d("Unresolved type for %s (arrayDimensions=%s)", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("Unresolved type alias %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Return type for %s cannot be resolved", false),
    f54976f("Return type for function cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("Return type for property %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("Return type for constructor %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("Implicit return type for function %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("Implicit return type for property %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("Implicit return type for property accessor %s cannot be resolved", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("%s() return type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Recursive type", false),
    f54977g("Recursive type alias %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Recursive annotation's type", false),
    f54978i("Cyclic upper bounds", false),
    f54979j("Cyclic supertypes", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Cannot infer a lambda context receiver type", false),
    f54980n("Cannot infer a lambda parameter type", false),
    f54981o("Cannot infer a type variable %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Resolution error type (%s)", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error expected type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Error type for data flow", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Failed to reconstruct type %s", false),
    f54982p("Unable to substitute type (%s)", false),
    f54983q("Special DONT_CARE type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Stub type %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Function placeholder type (arguments: %s)", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Stubbed 'Result' type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error type for a compiler exception while analyzing %s", false),
    f54984r("Error java flexible type with id %s. (%s..%s)", false),
    f54985s("Error raw type %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Illegal type range for dynamic type %s..%s", false),
    f54986t("Unknown type parameter %s. Please try recompiling module containing \"%s\"", false),
    f54987u("Couldn't deserialize type parameter %s in %s", false),
    f54988v("Inconsistent suspend function type in metadata with constructor %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Unexpected id of a flexible type %s. (%s..%s)", false),
    f54989w("Unknown type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("No type specified for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Loop range has no type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Loop parameter has no type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Missed a type for a value parameter %s", false),
    f54990x("Missed a type argument for a type parameter %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Error type for parse error argument %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error type for star projection directly passing as a call type argument", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Dynamic type in a not allowed context", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Not an annotation type %s in the annotation context", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Unit type returned by inc or dec", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Return not allowed", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("Unresolved 'Parcel' type", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Kapt error type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Error type for synthetic element", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error type in ad hoc resolve for lighter classes", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Error expression type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error receiver type for %s", false),
    f54991y("Error constant value %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Empty callable reference", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Unsupported callable reference type %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error delegation type for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Type is unavailable for declaration %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error type parameter", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Error type projection", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Error super type", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Supertype of error type %s", false),
    f54992z("Error property type", false),
    f54963A("Error class", false),
    f54964B("Type for error type constructor (%s)", false),
    f54965C("Intersection of error types %s", false),
    f54966D("Cannot compute erased upper bound of a type parameter %s", false),
    f54967E("Unsigned type %s not found", false),
    f54968F("Not found the corresponding enum class for given enum entry %s.%s", false),
    f54969G("Not found recorded type for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Descriptor not found for function %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("Cannot build class type, descriptor not found for builder %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("Cannot build type parameter type, descriptor not found for builder %s", false),
    f54970H("Type for unmapped Java annotation target to Kotlin one", false),
    f54971I("Unknown type for an array element of a java annotation argument", false),
    f54972J("No fqName for annotation %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1113("No fqName for %s", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1126("Type for generated error expression", false);


    /* JADX INFO: renamed from: a */
    public final String f54993a;

    /* JADX INFO: renamed from: b */
    public final boolean f54994b;

    ErrorTypeKind(String str, boolean z2) {
        this.f54993a = str;
        this.f54994b = z2;
    }
}
