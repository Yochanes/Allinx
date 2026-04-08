package androidx.core.view.accessibility;

import android.view.View;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface AccessibilityViewCommand {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class CommandArguments {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MoveAtGranularityArguments extends CommandArguments {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MoveHtmlArguments extends CommandArguments {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MoveWindowArguments extends CommandArguments {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ScrollToPositionArguments extends CommandArguments {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SetProgressArguments extends CommandArguments {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SetSelectionArguments extends CommandArguments {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SetTextArguments extends CommandArguments {
    }

    boolean perform(View view, CommandArguments commandArguments);
}
