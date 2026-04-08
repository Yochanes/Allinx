package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, m18302d2 = {"Lcom/google/accompanist/insets/RootWindowInsets;", "Lcom/google/accompanist/insets/WindowInsets;", "()V", "displayCutout", "Lcom/google/accompanist/insets/MutableWindowInsetsType;", "getDisplayCutout", "()Lcom/google/accompanist/insets/MutableWindowInsetsType;", "ime", "getIme", "navigationBars", "getNavigationBars", "statusBars", "getStatusBars", "systemBars", "Lcom/google/accompanist/insets/WindowInsets$Type;", "getSystemBars", "()Lcom/google/accompanist/insets/WindowInsets$Type;", "systemGestures", "getSystemGestures", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class RootWindowInsets implements WindowInsets {

    @NotNull
    private final MutableWindowInsetsType systemGestures = new MutableWindowInsetsType();

    @NotNull
    private final MutableWindowInsetsType navigationBars = new MutableWindowInsetsType();

    @NotNull
    private final MutableWindowInsetsType statusBars = new MutableWindowInsetsType();

    @NotNull
    private final MutableWindowInsetsType ime = new MutableWindowInsetsType();

    @NotNull
    private final MutableWindowInsetsType displayCutout = new MutableWindowInsetsType();

    @NotNull
    private final WindowInsets.Type systemBars = WindowInsetsTypeKt.derivedWindowInsetsTypeOf(getStatusBars(), getNavigationBars());

    @Override // com.google.accompanist.insets.WindowInsets
    public /* bridge */ /* synthetic */ WindowInsets.Type getDisplayCutout() {
        return getDisplayCutout();
    }

    @Override // com.google.accompanist.insets.WindowInsets
    public /* bridge */ /* synthetic */ WindowInsets.Type getIme() {
        return getIme();
    }

    @Override // com.google.accompanist.insets.WindowInsets
    public /* bridge */ /* synthetic */ WindowInsets.Type getNavigationBars() {
        return getNavigationBars();
    }

    @Override // com.google.accompanist.insets.WindowInsets
    public /* bridge */ /* synthetic */ WindowInsets.Type getStatusBars() {
        return getStatusBars();
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public WindowInsets.Type getSystemBars() {
        return this.systemBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    public /* bridge */ /* synthetic */ WindowInsets.Type getSystemGestures() {
        return getSystemGestures();
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getDisplayCutout() {
        return this.displayCutout;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getIme() {
        return this.ime;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getNavigationBars() {
        return this.navigationBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getStatusBars() {
        return this.statusBars;
    }

    @Override // com.google.accompanist.insets.WindowInsets
    @NotNull
    public MutableWindowInsetsType getSystemGestures() {
        return this.systemGestures;
    }
}
