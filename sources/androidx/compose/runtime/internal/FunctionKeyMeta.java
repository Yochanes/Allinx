package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.Repeatable;
import kotlin.jvm.internal.RepeatableContainer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@kotlin.annotation.Target
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention
@ComposeCompilerApi
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/compose/runtime/internal/FunctionKeyMeta;", "", "", "key", "startOffset", "endOffset", "<init>", "(III)V", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
public @interface FunctionKeyMeta {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE})
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @kotlin.annotation.Target
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention
    @RepeatableContainer
    public @interface Container {
    }
}
