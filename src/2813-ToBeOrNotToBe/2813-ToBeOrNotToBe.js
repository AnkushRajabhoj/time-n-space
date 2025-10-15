// Last updated: 15/10/2025, 05:56:49
/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: function(num) {
            if (val === num) {
                return true
            }
            throw "Not Equal"
        },
        notToBe: function(num) {
            if (val !== num) {
                return true
            }
            throw "Equal"
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */