package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.MergePathsContent;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Logger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MergePaths implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final MergePathsMode f34572a;

    /* JADX INFO: renamed from: b */
    public final boolean f34573b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class MergePathsMode {

        /* JADX INFO: renamed from: a */
        public static final MergePathsMode f34574a;

        /* JADX INFO: renamed from: b */
        public static final MergePathsMode f34575b;

        /* JADX INFO: renamed from: c */
        public static final MergePathsMode f34576c;

        /* JADX INFO: renamed from: d */
        public static final MergePathsMode f34577d;

        /* JADX INFO: renamed from: f */
        public static final MergePathsMode f34578f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ MergePathsMode[] f34579g;

        static {
            MergePathsMode mergePathsMode = new MergePathsMode("MERGE", 0);
            f34574a = mergePathsMode;
            MergePathsMode mergePathsMode2 = new MergePathsMode("ADD", 1);
            f34575b = mergePathsMode2;
            MergePathsMode mergePathsMode3 = new MergePathsMode("SUBTRACT", 2);
            f34576c = mergePathsMode3;
            MergePathsMode mergePathsMode4 = new MergePathsMode("INTERSECT", 3);
            f34577d = mergePathsMode4;
            MergePathsMode mergePathsMode5 = new MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
            f34578f = mergePathsMode5;
            f34579g = new MergePathsMode[]{mergePathsMode, mergePathsMode2, mergePathsMode3, mergePathsMode4, mergePathsMode5};
        }

        public static MergePathsMode valueOf(String str) {
            return (MergePathsMode) Enum.valueOf(MergePathsMode.class, str);
        }

        public static MergePathsMode[] values() {
            return (MergePathsMode[]) f34579g.clone();
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z2) {
        this.f34572a = mergePathsMode;
        this.f34573b = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* JADX INFO: renamed from: a */
    public final Content mo12653a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        if (lottieDrawable.f34079n) {
            return new MergePathsContent(this);
        }
        Logger.m12736b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f34572a + '}';
    }
}
