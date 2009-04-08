package control.nurbs;

import java.util.Vector;

import control.DragMouseHandler;

import model.NURBSShape;

/**
 * mouse drag handling for all mouse modes implementing shape modfication 
 * especially built for NURBS Modifications
 *
 * Each implementing Class should provide one wad to create or modify shapes
 *
 * @author Ronny Bergmann
 *
 */
public interface ShapeMouseHandler extends DragMouseHandler 
{
	/**
	 * Set Shape to an empty/null object
	 */
	public void resetShape();
	
	/**
	 * Get Parameters for NURBSShapeFactory of the actually created Shape
	 * @return
	 */
	public Vector<Object> getShapeParameters();

	/**
	 * Set the Shape externally with NURBSShapeFactory-Parameters
	 * @param p
	 */
	public void setShapeParameters(Vector<Object> p);

	/**
	 * Get Shape for drawing, if not null, else null is returned
	 * @return
	 */
	public NURBSShape getShape();	
}
