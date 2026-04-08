package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Method from annotation default annotation not found: attributeId */
/* JADX WARN: Method from annotation default annotation not found: enumMapping */
/* JADX WARN: Method from annotation default annotation not found: flagMapping */
/* JADX WARN: Method from annotation default annotation not found: hasAttributeId */
/* JADX WARN: Method from annotation default annotation not found: name */
/* JADX WARN: Method from annotation default annotation not found: valueType */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m18302d2 = {"Landroidx/annotation/InspectableProperty;", "", "", "name", "", "attributeId", "", "hasAttributeId", "Landroidx/annotation/InspectableProperty$ValueType;", "valueType", "", "Landroidx/annotation/InspectableProperty$EnumEntry;", "enumMapping", "Landroidx/annotation/InspectableProperty$FlagEntry;", "flagMapping", "<init>", "(Ljava/lang/String;IZLandroidx/annotation/InspectableProperty$ValueType;Lkotlin/Array;Lkotlin/Array;)V", "EnumEntry", "FlagEntry", "ValueType", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Deprecated
@kotlin.annotation.Target
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention
public @interface InspectableProperty {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/annotation/InspectableProperty$EnumEntry;", "", "", "name", "", "value", "<init>", "(Ljava/lang/String;I)V", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface EnumEntry {
    }

    /* JADX WARN: Method from annotation default annotation not found: mask */
    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Landroidx/annotation/InspectableProperty$FlagEntry;", "", "", "name", "", "target", "mask", "<init>", "(Ljava/lang/String;II)V", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface FlagEntry {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/annotation/InspectableProperty$ValueType;", "", "annotation"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class ValueType {

        /* JADX INFO: renamed from: a */
        public static final ValueType f251a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ ValueType[] f252b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f253c;

        static {
            ValueType valueType = new ValueType("NONE", 0);
            ValueType valueType2 = new ValueType("INFERRED", 1);
            f251a = valueType2;
            ValueType[] valueTypeArr = {valueType, valueType2, new ValueType("INT_ENUM", 2), new ValueType("INT_FLAG", 3), new ValueType("COLOR", 4), new ValueType("GRAVITY", 5), new ValueType("RESOURCE_ID", 6)};
            f252b = valueTypeArr;
            f253c = EnumEntriesKt.m18563a(valueTypeArr);
        }

        public static ValueType valueOf(String str) {
            return (ValueType) Enum.valueOf(ValueType.class, str);
        }

        public static ValueType[] values() {
            return (ValueType[]) f252b.clone();
        }
    }
}
