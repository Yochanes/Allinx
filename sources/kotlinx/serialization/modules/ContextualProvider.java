package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/serialization/modules/ContextualProvider;", "", "Argless", "WithTypeArguments", "Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class ContextualProvider {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Argless extends ContextualProvider {

        /* JADX INFO: renamed from: a */
        public final KSerializer f56958a;

        public Argless(KSerializer kSerializer) {
            this.f56958a = kSerializer;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        /* JADX INFO: renamed from: a */
        public final KSerializer mo21160a(List typeArgumentsSerializers) {
            Intrinsics.m18599g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f56958a;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Argless) && Intrinsics.m18594b(((Argless) obj).f56958a, this.f56958a);
        }

        public final int hashCode() {
            return this.f56958a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "Lkotlinx/serialization/modules/ContextualProvider;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class WithTypeArguments extends ContextualProvider {

        /* JADX INFO: renamed from: a */
        public final Function1 f56959a;

        public WithTypeArguments(Function1 function1) {
            this.f56959a = function1;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        /* JADX INFO: renamed from: a */
        public final KSerializer mo21160a(List typeArgumentsSerializers) {
            Intrinsics.m18599g(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (KSerializer) this.f56959a.invoke(typeArgumentsSerializers);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract KSerializer mo21160a(List list);
}
