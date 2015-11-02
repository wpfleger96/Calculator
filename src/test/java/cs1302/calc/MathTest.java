package cs1302.calc;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertTrue;

/** 
 * Tests for the <code>Math</code> interface. Subclasses should set
 * <code>impl</code> to a different implementation in their default
 * constructors.
 *
 * @author Michael E. Cotterell
 */
public class MathTest {

    protected Math impl = new BasicMath();

    @Rule
    public Timeout globalTimeout = new Timeout(1000); 
    
    @Test
    public void testInc() {
        try {
            assertTrue("inc(0) != 1", impl.inc(0) == 1);
            assertTrue("inc(1) != 2", impl.inc(1) == 2);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try
    } // testInc

    @Test
    public void testDec() {
        try {
            assertTrue("dec(0) != 0", impl.dec(0) == 0);
            assertTrue("inc(1) != 0", impl.dec(1) == 0);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try
    } // testDec

    @Test
    public void testAdd() {
        try {
            assertTrue("add(0, 0) != 0", impl.add(0, 0) == 0);
            assertTrue("add(4, 0) != 4", impl.add(4, 0) == 4);
            assertTrue("add(0, 4) != 4", impl.add(0, 4) == 4);
            assertTrue("add(4, 4) != 8", impl.add(4, 4) == 8);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try        
    } // testAdd

    @Test
    public void testSub() {
        try {
            assertTrue("sub(0, 0) != 0", impl.sub(0, 0) == 0);
            assertTrue("sub(4, 0) != 4", impl.sub(4, 0) == 4);
            assertTrue("sub(0, 4) != 0", impl.sub(0, 4) == 0);
            assertTrue("sub(4, 4) != 0", impl.sub(4, 4) == 0);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try        
    } // testSub

    @Test
    public void testMul() {
        try {
            assertTrue("mul(0, 0) != 0", impl.mul(0, 0) == 0);
            assertTrue("mul(2, 0) != 0", impl.mul(2, 0) == 0);
            assertTrue("mul(0, 2) != 0", impl.mul(0, 2) == 0);
            assertTrue("mul(2, 2) != 4", impl.mul(2, 2) == 4);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try        
    } // testMul

    @Test(expected = ArithmeticException.class)
    public void testDivEx() {
        try {
            impl.div(0, 0);
        } catch (UnsupportedOperationException e) {
            throw new ArithmeticException("not implemented");
        } // try        
    } // testDivEx

    @Test
    public void testDiv() {
        try {
            assertTrue("div(4, 2) != 2", impl.div(4, 2) == 2);
            assertTrue("div(3, 2) != 1", impl.div(3, 2) == 1);
            assertTrue("div(0, 2) != 0", impl.div(0, 2) == 0);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try        
    } // testDiv

    @Test
    public void testFac() {
        try {
            assertTrue("fac(0) != 0", impl.fac(0) == 1);
            assertTrue("fac(1) != 1", impl.fac(1) == 1);
            assertTrue("fac(2) != 2", impl.fac(2) == 2);
            assertTrue("fac(3) != 6", impl.fac(3) == 6);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try        
    } // testFac

    @Test
    public void testPow() {
        try {
            assertTrue("pow(2, 0) != 1",  impl.pow(2, 0) == 1);
            assertTrue("pow(2, 2) != 4",  impl.pow(2, 2) == 4);
            assertTrue("pow(2, 3) != 8",  impl.pow(2, 3) == 8);
            assertTrue("pow(2, 4) != 16", impl.pow(2, 4) == 16);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try        
    } // testPow

    @Test
    public void testLshift() {
        try {
            assertTrue("lshift(1, 0) != 1",  impl.lshift(1, 0) == 1);
            assertTrue("lshift(1, 1) != 2",  impl.lshift(1, 1) == 2);
            assertTrue("lshift(1, 2) != 4",  impl.lshift(1, 2) == 4);
            assertTrue("lshift(1, 3) != 8",  impl.lshift(1, 3) == 8);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try        
    } // testLshift

    @Test
    public void testRshift() {
        try {
            assertTrue("rshift(4, 0) != 4",  impl.rshift(4, 0) == 4);
            assertTrue("rshift(4, 1) != 2",  impl.rshift(4, 1) == 2);
            assertTrue("rshift(4, 2) != 1",  impl.rshift(4, 2) == 1);
            assertTrue("rshift(4, 3) != 0",  impl.rshift(4, 3) == 0);
        } catch (UnsupportedOperationException e) {
            assertTrue("not implemented", false);
        } // try        
    } // testRshift

    
} // MathTest
