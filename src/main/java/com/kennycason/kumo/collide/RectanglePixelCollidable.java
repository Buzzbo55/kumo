package com.kennycason.kumo.collide;

import com.kennycason.kumo.collide.checkers.RectanglePixelCollisionChecker;
import com.kennycason.kumo.image.CollisionRaster;

/**
 * Created by kenny on 7/2/14.
 */
public class RectanglePixelCollidable implements Collidable {

    private static final RectanglePixelCollisionChecker RECTANGLE_PIXEL_COLLISION_CHECKER = new RectanglePixelCollisionChecker();

    private final Vector2d position;

    private final CollisionRaster collisionRaster;

    public RectanglePixelCollidable(final CollisionRaster collisionRaster, final int x, final int y) {
        this.collisionRaster = collisionRaster;
        this.position = new Vector2d(x, y);
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    @Override
    public boolean collide(Collidable collidable) {
        return RECTANGLE_PIXEL_COLLISION_CHECKER.collide(this, collidable);
    }

    @Override
    public Vector2d getPosition() {
        return position;
    }

    @Override
    public int getWidth() {
        return collisionRaster.getWidth();
    }

    @Override
    public int getHeight() {
        return collisionRaster.getHeight();
    }

    @Override
    public CollisionRaster getCollisionRaster() {
        return collisionRaster;
    }

}