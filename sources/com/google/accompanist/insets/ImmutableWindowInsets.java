package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m18302d2 = {"Lcom/google/accompanist/insets/ImmutableWindowInsets;", "Lcom/google/accompanist/insets/WindowInsets;", "systemGestures", "Lcom/google/accompanist/insets/WindowInsets$Type;", "navigationBars", "statusBars", "ime", "displayCutout", "(Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/WindowInsets$Type;Lcom/google/accompanist/insets/WindowInsets$Type;)V", "getDisplayCutout", "()Lcom/google/accompanist/insets/WindowInsets$Type;", "getIme", "getNavigationBars", "getStatusBars", "systemBars", "getSystemBars", "getSystemGestures", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ImmutableWindowInsets implements WindowInsets {

    @NotNull
    private final WindowInsets.Type displayCutout;

    @NotNull
    private final WindowInsets.Type ime;

    @NotNull
    private final WindowInsets.Type navigationBars;

    @NotNull
    private final WindowInsets.Type statusBars;

    @NotNull
    private final WindowInsets.Type systemBars;

    @NotNull
    private final WindowInsets.Type systemGestures;

    public ImmutableWindowInsets() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getDisplayCutout() {
        return this.displayCutout;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getIme() {
        return this.ime;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getNavigationBars() {
        return this.navigationBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getStatusBars() {
        return this.statusBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getSystemBars() {
        return this.systemBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getSystemGestures() {
        return this.systemGestures;
    }

    public ImmutableWindowInsets(@NotNull WindowInsets.Type systemGestures, @NotNull WindowInsets.Type navigationBars, @NotNull WindowInsets.Type statusBars, @NotNull WindowInsets.Type ime, @NotNull WindowInsets.Type displayCutout) {
        Intrinsics.m18599g(systemGestures, "systemGestures");
        Intrinsics.m18599g(navigationBars, "navigationBars");
        Intrinsics.m18599g(statusBars, "statusBars");
        Intrinsics.m18599g(ime, "ime");
        Intrinsics.m18599g(displayCutout, "displayCutout");
        this.systemGestures = systemGestures;
        this.navigationBars = navigationBars;
        this.statusBars = statusBars;
        this.ime = ime;
        this.displayCutout = displayCutout;
        this.systemBars = WindowInsetsTypeKt.derivedWindowInsetsTypeOf(getStatusBars(), getNavigationBars());
    }

    public /* synthetic */ ImmutableWindowInsets(WindowInsets.Type type, WindowInsets.Type type2, WindowInsets.Type type3, WindowInsets.Type type4, WindowInsets.Type type5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WindowInsets.Type.INSTANCE.getEmpty() : type, (i & 2) != 0 ? WindowInsets.Type.INSTANCE.getEmpty() : type2, (i & 4) != 0 ? WindowInsets.Type.INSTANCE.getEmpty() : type3, (i & 8) != 0 ? WindowInsets.Type.INSTANCE.getEmpty() : type4, (i & 16) != 0 ? WindowInsets.Type.INSTANCE.getEmpty() : type5);
    }
}
