package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX WARN: Method from annotation default annotation not found: name */
/* JADX WARN: Method from annotation default annotation not found: orders */
/* JADX WARN: Method from annotation default annotation not found: unique */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Target({})
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\fB?\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m18302d2 = {"Landroidx/room/Index;", "", "", "", "value", "Landroidx/room/Index$Order;", "orders", "name", "", "unique", "<init>", "(Lkotlin/Array;Lkotlin/Array;Ljava/lang/String;Z)V", "Order", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
public @interface Index {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/Index$Order;", "", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Order {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Order[] f31899a = {new Order("ASC", 0), new Order("DESC", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Order EF5;

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) f31899a.clone();
        }
    }
}
