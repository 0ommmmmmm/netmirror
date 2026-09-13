package U1;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.AbstractC0393g;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.U;

/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractC0393g {
    public e(BaseViewManager<Object, ? extends U> baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC0393g, com.facebook.react.uimanager.Q0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "progress":
                ((f) this.f7478a).setProgress(view, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case "testID":
                ((f) this.f7478a).setTestID(view, obj == null ? "" : (String) obj);
                break;
            case "typeAttr":
                ((f) this.f7478a).setTypeAttr(view, obj != null ? (String) obj : null);
                break;
            case "color":
                ((f) this.f7478a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "indeterminate":
                ((f) this.f7478a).setIndeterminate(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animating":
                ((f) this.f7478a).setAnimating(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "styleAttr":
                ((f) this.f7478a).setStyleAttr(view, obj != null ? (String) obj : null);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
