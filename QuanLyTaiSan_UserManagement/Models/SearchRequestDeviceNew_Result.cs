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
    
    public partial class SearchRequestDeviceNew_Result
    {
        public int Id { get; set; }
        public Nullable<int> UserRequest { get; set; }
        public Nullable<System.DateTime> DateOfRequest { get; set; }
        public Nullable<System.DateTime> DateOfUse { get; set; }
        public string DeviceName { get; set; }
        public Nullable<int> TypeOfDevice { get; set; }
        public string Configuration { get; set; }
        public string Notes { get; set; }
        public Nullable<bool> Approved { get; set; }
        public Nullable<int> UserApproved { get; set; }
        public Nullable<System.DateTime> CreatedDate { get; set; }
        public Nullable<int> Status { get; set; }
        public string FullName { get; set; }
        public string TypeName { get; set; }
        public Nullable<int> NumDevice { get; set; }
    }
}
