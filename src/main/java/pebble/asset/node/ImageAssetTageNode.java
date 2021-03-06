package pebble.asset.node;

import com.mitchellbosecke.pebble.node.expression.Expression;
import com.mitchellbosecke.pebble.node.expression.MapExpression;
import pebble.asset.RevAssetPathResolver;

public class ImageAssetTageNode extends AbstractAssetTagNode {
    public ImageAssetTageNode(int lineNumber, Expression<?> sourcesExpression, MapExpression mapExpression, RevAssetPathResolver resolver) {
        super(lineNumber, sourcesExpression, mapExpression, resolver);
    }

    @Override
    public String tagName() {
        return "img";
    }
}
