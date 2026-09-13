package U1;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC0393g;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.U;

/* JADX INFO: loaded from: classes.dex */
public class g extends AbstractC0393g {
    public g(BaseViewManager<Object, ? extends U> baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC0393g, com.facebook.react.uimanager.Q0
    public void a(View view, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing")) {
            ((h) this.f7478a).setNativeRefreshing(view, readableArray.getBoolean(0));
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC0393g, com.facebook.react.uimanager.Q0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "enabled":
                ((h) this.f7478a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "colors":
                ((h) this.f7478a).setColors(view, (ReadableArray) obj);
                break;
            case "progressBackgroundColor":
                ((h) this.f7478a).setProgressBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "progressViewOffset":
                ((h) this.f7478a).setProgressViewOffset(view, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "refreshing":
                ((h) this.f7478a).setRefreshing(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "size":
                ((h) this.f7478a).setSize(view, (String) obj);
                break;
            default:
                super.b(view, str, obj);
                break;
        }
    }
}
