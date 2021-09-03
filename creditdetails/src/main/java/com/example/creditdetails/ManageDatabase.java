package com.example.creditdetails;


import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class ManageDatabase {
    private DatabaseReference databaseReference, branchRef,semesterRef,codeRef;
    public ManageDatabase() {

    }

    public Task<Void> addData(String subjectCode, SubjectCredits subCre, String dept, String semester) {
        databaseReference = FirebaseDatabase.getInstance().getReference(SubjectCredits.class.getSimpleName());
        branchRef = databaseReference.child(dept);
        semesterRef = branchRef.child(semester);
        return semesterRef.child(subjectCode.toUpperCase()).setValue(subCre);
    }

    public Task<Void> removeData(String subjectCode, String dept, String semester) {
        boolean flag;
        databaseReference = FirebaseDatabase.getInstance().getReference(SubjectCredits.class.getSimpleName());
        branchRef = databaseReference.child(dept);
        semesterRef = branchRef.child(semester);
        return semesterRef.child(subjectCode.toUpperCase()).removeValue();
    }

}
