package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnquotedLiterals;", "Lkotlinx/serialization/json/internal/Composer;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SuppressAnimalSniffer
public final class ComposerForUnquotedLiterals extends Composer {

    /* JADX INFO: renamed from: c */
    public final boolean f56880c;

    public ComposerForUnquotedLiterals(JsonToStringWriter jsonToStringWriter, boolean z2) {
        super(jsonToStringWriter);
        this.f56880c = z2;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: j */
    public final void mo21112j(String value) {
        Intrinsics.m18599g(value, "value");
        if (this.f56880c) {
            super.mo21112j(value);
        } else {
            m21110h(value);
        }
    }
}
