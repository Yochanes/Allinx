package androidx.compose.p013ui.node;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface TraversableNode extends DelegatableNode {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion;", "", "TraverseDescendantsAction", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class TraverseDescendantsAction {

            /* JADX INFO: renamed from: a */
            public static final TraverseDescendantsAction f19016a;

            /* JADX INFO: renamed from: b */
            public static final TraverseDescendantsAction f19017b;

            /* JADX INFO: renamed from: c */
            public static final TraverseDescendantsAction f19018c;

            /* JADX INFO: renamed from: d */
            public static final /* synthetic */ TraverseDescendantsAction[] f19019d;

            /* JADX INFO: renamed from: f */
            public static final /* synthetic */ EnumEntries f19020f;

            static {
                TraverseDescendantsAction traverseDescendantsAction = new TraverseDescendantsAction("ContinueTraversal", 0);
                f19016a = traverseDescendantsAction;
                TraverseDescendantsAction traverseDescendantsAction2 = new TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
                f19017b = traverseDescendantsAction2;
                TraverseDescendantsAction traverseDescendantsAction3 = new TraverseDescendantsAction("CancelTraversal", 2);
                f19018c = traverseDescendantsAction3;
                TraverseDescendantsAction[] traverseDescendantsActionArr = {traverseDescendantsAction, traverseDescendantsAction2, traverseDescendantsAction3};
                f19019d = traverseDescendantsActionArr;
                f19020f = EnumEntriesKt.m18563a(traverseDescendantsActionArr);
            }

            public static TraverseDescendantsAction valueOf(String str) {
                return (TraverseDescendantsAction) Enum.valueOf(TraverseDescendantsAction.class, str);
            }

            public static TraverseDescendantsAction[] values() {
                return (TraverseDescendantsAction[]) f19019d.clone();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    Object mo2400S();
}
