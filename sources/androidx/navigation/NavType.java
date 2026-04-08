package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006\u001d\u001e\u001f !\"J\u001f\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u00028\u00002\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ5\u0010\f\u001a\u00028\u00002\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016¨\u0006#"}, m18302d2 = {"Landroidx/navigation/NavType;", "T", "", "", "value", "previousValue", "parseValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "key", "parseAndPut", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "serializeAsValue", "(Ljava/lang/Object;)Ljava/lang/String;", "other", "", "valueEquals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "isNullableAllowed", "Z", "()Z", "name", "Ljava/lang/String;", "getName", "Companion", "ParcelableType", "ParcelableArrayType", "SerializableType", "EnumType", "SerializableArrayType", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class NavType<T> {
    private final boolean isNullableAllowed;

    @NotNull
    private final String name = "nav_type";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    public static final NavType<Integer> IntType = new IntNavType(false);

    @JvmField
    @NotNull
    public static final NavType<Integer> ReferenceType = new NavType$Companion$ReferenceType$1(false);

    @JvmField
    @NotNull
    public static final NavType<int[]> IntArrayType = new IntArrayNavType(true);

    @JvmField
    @NotNull
    public static final NavType<List<Integer>> IntListType = new IntListNavType(true);

    @JvmField
    @NotNull
    public static final NavType<Long> LongType = new LongNavType(false);

    @JvmField
    @NotNull
    public static final NavType<long[]> LongArrayType = new LongArrayNavType(true);

    @JvmField
    @NotNull
    public static final NavType<List<Long>> LongListType = new LongListNavType(true);

    @JvmField
    @NotNull
    public static final NavType<Float> FloatType = new FloatNavType(false);

    @JvmField
    @NotNull
    public static final NavType<float[]> FloatArrayType = new FloatArrayNavType(true);

    @JvmField
    @NotNull
    public static final NavType<List<Float>> FloatListType = new FloatListNavType(true);

    @JvmField
    @NotNull
    public static final NavType<Boolean> BoolType = new BoolNavType(false);

    @JvmField
    @NotNull
    public static final NavType<boolean[]> BoolArrayType = new BoolArrayNavType(true);

    @JvmField
    @NotNull
    public static final NavType<List<Boolean>> BoolListType = new BoolListNavType(true);

    @JvmField
    @NotNull
    public static final NavType<String> StringType = new StringNavType(true);

    @JvmField
    @NotNull
    public static final NavType<String[]> StringArrayType = new StringArrayNavType(true);

    @JvmField
    @NotNull
    public static final NavType<List<String>> StringListType = new StringListNavType(true);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0005R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001c0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0005¨\u0006\u001f"}, m18302d2 = {"Landroidx/navigation/NavType$Companion;", "", "Landroidx/navigation/NavType;", "", "IntType", "Landroidx/navigation/NavType;", "ReferenceType", "", "IntArrayType", "", "IntListType", "", "LongType", "", "LongArrayType", "LongListType", "", "FloatType", "", "FloatArrayType", "FloatListType", "", "BoolType", "", "BoolArrayType", "BoolListType", "", "StringType", "", "StringArrayType", "StringListType", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static NavType m11245a(Object obj) {
            NavType navType;
            if (obj instanceof Integer) {
                navType = NavType.IntType;
                Intrinsics.m18597e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof int[]) {
                navType = NavType.IntArrayType;
                Intrinsics.m18597e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof Long) {
                navType = NavType.LongType;
                Intrinsics.m18597e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof long[]) {
                navType = NavType.LongArrayType;
                Intrinsics.m18597e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof Float) {
                navType = NavType.FloatType;
                Intrinsics.m18597e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof float[]) {
                navType = NavType.FloatArrayType;
                Intrinsics.m18597e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof Boolean) {
                navType = NavType.BoolType;
                Intrinsics.m18597e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if (obj instanceof boolean[]) {
                navType = NavType.BoolArrayType;
                Intrinsics.m18597e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else if ((obj instanceof String) || obj == null) {
                navType = NavType.StringType;
                Intrinsics.m18597e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            } else {
                navType = null;
            }
            if (navType != null) {
                return navType;
            }
            if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                NavType<String[]> navType2 = NavType.StringArrayType;
                Intrinsics.m18597e(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType2;
            }
            Intrinsics.m18596d(obj);
            if (obj.getClass().isArray()) {
                Class<?> componentType = obj.getClass().getComponentType();
                Intrinsics.m18596d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    Intrinsics.m18597e(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new ParcelableArrayType(componentType2);
                }
            }
            if (obj.getClass().isArray()) {
                Class<?> componentType3 = obj.getClass().getComponentType();
                Intrinsics.m18596d(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = obj.getClass().getComponentType();
                    Intrinsics.m18597e(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new SerializableArrayType(componentType4);
                }
            }
            if (obj instanceof Parcelable) {
                return new ParcelableType(obj.getClass());
            }
            if (obj instanceof Enum) {
                return new EnumType(obj.getClass());
            }
            if (obj instanceof Serializable) {
                return new SerializableType(obj.getClass());
            }
            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
        }

        /* JADX INFO: renamed from: b */
        public static NavType m11246b(Class cls, boolean z2) {
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z2 ? new ParcelableArrayType(cls) : new ParcelableType(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z2) {
                return new EnumType(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z2 ? new SerializableArrayType(cls) : new SerializableType(cls);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/navigation/NavType$EnumType;", "", "D", "Landroidx/navigation/NavType$SerializableType;", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {

        /* JADX INFO: renamed from: b */
        public final Class f30275b;

        public EnumType(Class cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f30275b = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType
        /* JADX INFO: renamed from: a */
        public final /* bridge */ /* synthetic */ Serializable mo11247a(String str) {
            return m11248b(str);
        }

        /* JADX INFO: renamed from: b */
        public final Enum m11248b(String value) {
            Object obj;
            Intrinsics.m18599g(value, "value");
            Class cls = this.f30275b;
            Object[] enumConstants = cls.getEnumConstants();
            Intrinsics.m18598f(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i];
                if (StringsKt.m20442r(((Enum) obj).name(), value, true)) {
                    break;
                }
                i++;
            }
            Enum r4 = (Enum) obj;
            if (r4 != null) {
                return r4;
            }
            StringBuilder sbM23t = AbstractC0000a.m23t("Enum value ", value, " not found for type ");
            sbM23t.append(cls.getName());
            sbM23t.append('.');
            throw new IllegalArgumentException(sbM23t.toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public final String getName() {
            return this.f30275b.getName();
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public final /* bridge */ /* synthetic */ Object parseValue(String str) {
            return m11248b(str);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {

        /* JADX INFO: renamed from: a */
        public final Class f30276a;

        public ParcelableArrayType(Class cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.f30276a = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ParcelableArrayType.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.m18594b(this.f30276a, ((ParcelableArrayType) obj).f30276a);
        }

        @Override // androidx.navigation.NavType
        public final Object get(Bundle bundle, String str) {
            Intrinsics.m18599g(bundle, "bundle");
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public final String getName() {
            return this.f30276a.getName();
        }

        public final int hashCode() {
            return this.f30276a.hashCode();
        }

        @Override // androidx.navigation.NavType
        public final Object parseValue(String value) {
            Intrinsics.m18599g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final void put(Bundle bundle, String key, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            Intrinsics.m18599g(bundle, "bundle");
            Intrinsics.m18599g(key, "key");
            this.f30276a.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        @Override // androidx.navigation.NavType
        public final boolean valueEquals(Object obj, Object obj2) {
            return ArraysKt.m18378m((Parcelable[]) obj, (Parcelable[]) obj2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class ParcelableType<D> extends NavType<D> {

        /* JADX INFO: renamed from: a */
        public final Class f30277a;

        public ParcelableType(Class cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f30277a = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ParcelableType.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.m18594b(this.f30277a, ((ParcelableType) obj).f30277a);
        }

        @Override // androidx.navigation.NavType
        public final Object get(Bundle bundle, String str) {
            Intrinsics.m18599g(bundle, "bundle");
            return bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public final String getName() {
            return this.f30277a.getName();
        }

        public final int hashCode() {
            return this.f30277a.hashCode();
        }

        @Override // androidx.navigation.NavType
        public final Object parseValue(String value) {
            Intrinsics.m18599g(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final void put(Bundle bundle, String key, Object obj) {
            Intrinsics.m18599g(bundle, "bundle");
            Intrinsics.m18599g(key, "key");
            this.f30277a.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {

        /* JADX INFO: renamed from: a */
        public final Class f30278a;

        public SerializableArrayType(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.f30278a = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !SerializableArrayType.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.m18594b(this.f30278a, ((SerializableArrayType) obj).f30278a);
        }

        @Override // androidx.navigation.NavType
        public final Object get(Bundle bundle, String str) {
            Intrinsics.m18599g(bundle, "bundle");
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public final String getName() {
            return this.f30278a.getName();
        }

        public final int hashCode() {
            return this.f30278a.hashCode();
        }

        @Override // androidx.navigation.NavType
        public final Object parseValue(String value) {
            Intrinsics.m18599g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // androidx.navigation.NavType
        public final void put(Bundle bundle, String key, Object obj) {
            ?? r4 = (Serializable[]) obj;
            Intrinsics.m18599g(bundle, "bundle");
            Intrinsics.m18599g(key, "key");
            this.f30278a.cast(r4);
            bundle.putSerializable(key, r4);
        }

        @Override // androidx.navigation.NavType
        public final boolean valueEquals(Object obj, Object obj2) {
            return ArraysKt.m18378m((Serializable[]) obj, (Serializable[]) obj2);
        }
    }

    public NavType(boolean z2) {
        this.isNullableAllowed = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    public static NavType<?> fromArgType(@Nullable String str, @Nullable String str2) {
        INSTANCE.getClass();
        NavType navType = IntType;
        boolean zM18594b = Intrinsics.m18594b(navType.getName(), str);
        NavType navType2 = navType;
        if (!zM18594b) {
            NavType navType3 = IntArrayType;
            boolean zM18594b2 = Intrinsics.m18594b(navType3.getName(), str);
            navType2 = navType3;
            if (!zM18594b2) {
                NavType navType4 = IntListType;
                boolean zM18594b3 = Intrinsics.m18594b(navType4.getName(), str);
                navType2 = navType4;
                if (!zM18594b3) {
                    NavType navType5 = LongType;
                    boolean zM18594b4 = Intrinsics.m18594b(navType5.getName(), str);
                    navType2 = navType5;
                    if (!zM18594b4) {
                        NavType navType6 = LongArrayType;
                        boolean zM18594b5 = Intrinsics.m18594b(navType6.getName(), str);
                        navType2 = navType6;
                        if (!zM18594b5) {
                            NavType navType7 = LongListType;
                            boolean zM18594b6 = Intrinsics.m18594b(navType7.getName(), str);
                            navType2 = navType7;
                            if (!zM18594b6) {
                                NavType navType8 = BoolType;
                                boolean zM18594b7 = Intrinsics.m18594b(navType8.getName(), str);
                                navType2 = navType8;
                                if (!zM18594b7) {
                                    NavType navType9 = BoolArrayType;
                                    boolean zM18594b8 = Intrinsics.m18594b(navType9.getName(), str);
                                    navType2 = navType9;
                                    if (!zM18594b8) {
                                        NavType navType10 = BoolListType;
                                        boolean zM18594b9 = Intrinsics.m18594b(navType10.getName(), str);
                                        navType2 = navType10;
                                        if (!zM18594b9) {
                                            NavType navType11 = StringType;
                                            boolean zM18594b10 = Intrinsics.m18594b(navType11.getName(), str);
                                            navType2 = navType11;
                                            if (!zM18594b10) {
                                                NavType navType12 = StringArrayType;
                                                boolean zM18594b11 = Intrinsics.m18594b(navType12.getName(), str);
                                                navType2 = navType12;
                                                if (!zM18594b11) {
                                                    NavType navType13 = StringListType;
                                                    boolean zM18594b12 = Intrinsics.m18594b(navType13.getName(), str);
                                                    navType2 = navType13;
                                                    if (!zM18594b12) {
                                                        NavType navType14 = FloatType;
                                                        boolean zM18594b13 = Intrinsics.m18594b(navType14.getName(), str);
                                                        navType2 = navType14;
                                                        if (!zM18594b13) {
                                                            NavType navType15 = FloatArrayType;
                                                            boolean zM18594b14 = Intrinsics.m18594b(navType15.getName(), str);
                                                            navType2 = navType15;
                                                            if (!zM18594b14) {
                                                                NavType navType16 = FloatListType;
                                                                boolean zM18594b15 = Intrinsics.m18594b(navType16.getName(), str);
                                                                navType2 = navType16;
                                                                if (!zM18594b15) {
                                                                    navType2 = null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (navType2 != null) {
            return navType2;
        }
        NavType<Integer> navType17 = ReferenceType;
        if (Intrinsics.m18594b(navType17.getName(), str)) {
            return navType17;
        }
        if (str == null || str.length() == 0) {
            return StringType;
        }
        try {
            String strConcat = (!StringsKt.m20416N(str, ".", false) || str2 == null) ? str : str2.concat(str);
            boolean zM20439o = StringsKt.m20439o(str, "[]", false);
            if (zM20439o) {
                strConcat = strConcat.substring(0, strConcat.length() - 2);
                Intrinsics.m18598f(strConcat, "substring(...)");
            }
            NavType<?> navTypeM11246b = Companion.m11246b(Class.forName(strConcat), zM20439o);
            if (navTypeM11246b != null) {
                return navTypeM11246b;
            }
            throw new IllegalArgumentException((strConcat + " is not Serializable or Parcelable.").toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @JvmStatic
    @RestrictTo
    @NotNull
    public static final NavType<Object> inferFromValue(@NotNull String value) {
        INSTANCE.getClass();
        Intrinsics.m18599g(value, "value");
        try {
            try {
                try {
                    try {
                        NavType<Integer> navType = IntType;
                        navType.parseValue(value);
                        return navType;
                    } catch (IllegalArgumentException unused) {
                        NavType<String> navType2 = StringType;
                        Intrinsics.m18597e(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType2;
                    }
                } catch (IllegalArgumentException unused2) {
                    NavType<Long> navType3 = LongType;
                    navType3.parseValue(value);
                    return navType3;
                }
            } catch (IllegalArgumentException unused3) {
                NavType<Boolean> navType4 = BoolType;
                navType4.parseValue(value);
                return navType4;
            }
        } catch (IllegalArgumentException unused4) {
            NavType<Float> navType5 = FloatType;
            navType5.parseValue(value);
            return navType5;
        }
    }

    @JvmStatic
    @RestrictTo
    @NotNull
    public static final NavType<Object> inferFromValueType(@Nullable Object obj) {
        INSTANCE.getClass();
        return Companion.m11245a(obj);
    }

    public abstract Object get(Bundle bundle, String str);

    @NotNull
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: isNullableAllowed, reason: from getter */
    public boolean getIsNullableAllowed() {
        return this.isNullableAllowed;
    }

    @RestrictTo
    public final T parseAndPut(@NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        Intrinsics.m18599g(bundle, "bundle");
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        T t = (T) parseValue(value);
        put(bundle, key, t);
        return t;
    }

    public abstract Object parseValue(String str);

    public T parseValue(@NotNull String value, T previousValue) {
        Intrinsics.m18599g(value, "value");
        return (T) parseValue(value);
    }

    public abstract void put(Bundle bundle, String str, Object obj);

    @NotNull
    public String serializeAsValue(T value) {
        return String.valueOf(value);
    }

    @NotNull
    public String toString() {
        return getName();
    }

    public boolean valueEquals(T value, T other) {
        return Intrinsics.m18594b(value, other);
    }

    @RestrictTo
    public final T parseAndPut(@NotNull Bundle bundle, @NotNull String key, @Nullable String value, T previousValue) {
        Intrinsics.m18599g(bundle, "bundle");
        Intrinsics.m18599g(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (value == null) {
            return previousValue;
        }
        T value2 = parseValue(value, previousValue);
        put(bundle, key, value2);
        return value2;
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/navigation/NavType$SerializableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class SerializableType<D extends Serializable> extends NavType<D> {

        /* JADX INFO: renamed from: a */
        public final Class f30279a;

        public SerializableType(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (!cls.isEnum()) {
                this.f30279a = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        /* JADX INFO: renamed from: a */
        public Serializable mo11247a(String value) {
            Intrinsics.m18599g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableType)) {
                return false;
            }
            return Intrinsics.m18594b(this.f30279a, ((SerializableType) obj).f30279a);
        }

        @Override // androidx.navigation.NavType
        public final Object get(Bundle bundle, String str) {
            Intrinsics.m18599g(bundle, "bundle");
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.f30279a.getName();
        }

        public final int hashCode() {
            return this.f30279a.hashCode();
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ Object parseValue(String str) {
            return mo11247a(str);
        }

        @Override // androidx.navigation.NavType
        public final void put(Bundle bundle, String key, Object obj) {
            Serializable value = (Serializable) obj;
            Intrinsics.m18599g(bundle, "bundle");
            Intrinsics.m18599g(key, "key");
            Intrinsics.m18599g(value, "value");
            this.f30279a.cast(value);
            bundle.putSerializable(key, value);
        }

        public SerializableType(Class cls, int i) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f30279a = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
