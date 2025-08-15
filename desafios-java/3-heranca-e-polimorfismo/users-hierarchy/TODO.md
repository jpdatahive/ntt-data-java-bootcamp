# User Hierarchy (Simplified)

---

### 1. `User` (Parent Class)
- **Attributes:** `name`, `email`, `password`, `isAdmin`
- **Core Methods:**
    - `login()`
    - `logoff()`
    - `changeInfo()`
    - `changePassword()`
- **Getters/Setters:** For all attributes.

---

### 2. `Manager` (Inherits from `User`)
- **Setup:** `isAdmin` is always `true`.
- **Exclusive Methods:**
    - `generateFinancialReport()`
    - `getGeneralSalesReport()`

---

### 3. `Seller` (Inherits from `User`)
- **Setup:** `isAdmin` is always `false`.
- **Exclusive Attribute:** `salesCount` (starts at 0).
- **Exclusive Methods:**
    - `makeSale()`
    - `getMySalesReport()`

---

### 4. `Attendant` (Inherits from `User`)
- **Setup:** `isAdmin` is always `false`.
- **Exclusive Attribute:** `cashBalance` (starts at 0.0).
- **Exclusive Methods:**
    - `receivePayment(amount)`
    - `closeCashier()`

---

### Test Plan
- [ ] Create one object of each type (`Manager`, `Seller`, `Attendant`).
- [ ] Test all their methods.
- [ ] Put all in a `User[]` array and test a common method (like `login`) to check polymorphism.
