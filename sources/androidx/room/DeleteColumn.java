package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m18302d2 = {"Landroidx/room/DeleteColumn;", "", "", "tableName", "columnName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Entries", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@kotlin.annotation.Target
@Repeatable(Entries.class)
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
public @interface DeleteColumn {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE})
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/room/DeleteColumn$Entries;", "", "", "Landroidx/room/DeleteColumn;", "value", "<init>", "(Lkotlin/Array;)V", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention
    public @interface Entries {
    }
}
