//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace QuanLyTaiSan_UserManagement.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class DeviceDevice
    {
        public int id { get; set; }
        public Nullable<int> DeviceCodeParents { get; set; }
        public Nullable<int> DeviceCodeChildren { get; set; }
        public Nullable<int> TypeSymbolParents { get; set; }
        public Nullable<int> TypeSymbolChildren { get; set; }
        public Nullable<System.DateTime> CreatedDate { get; set; }
        public Nullable<System.DateTime> ModifiedDate { get; set; }
        public Nullable<int> UserCreated { get; set; }
        public Nullable<int> UserModified { get; set; }
        public Nullable<bool> IsDeleted { get; set; }
        public string Notes { get; set; }
        public Nullable<int> TypeComponant { get; set; }
    
        public virtual Device Device { get; set; }
        public virtual Device Device1 { get; set; }
    }
}
